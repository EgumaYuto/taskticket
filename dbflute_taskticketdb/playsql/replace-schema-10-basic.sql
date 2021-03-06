

/* Create Tables */

CREATE TABLE MEMBER
(
	MEMBER_ID BIGINT NOT NULL AUTO_INCREMENT COMMENT 'メンバーID',
	MEMBER_NAME VARCHAR(100) NOT NULL COMMENT 'メンバー名 : 会員のフルネームの名称。苗字と名前を分けて管理することが多いが、ここでは単純にひとまとめ。',
	PASSWORD VARCHAR(64) NOT NULL COMMENT 'パスワード',
	EMAIL_ADDRESS VARCHAR(50) NOT NULL UNIQUE COMMENT 'メールアドレス : ログインIDとして利用する。昨今メールアドレスをログインIDとすることが多いので、あまり見かけないかも!?',
	MEMBER_STATUS_CODE CHAR(3) NOT NULL COMMENT 'メンバーステータスコード : 会員ステータスを参照するコード。ステータスが変わるたびに、このカラムが更新される。',
	REGISTER_DATETIME DATETIME NOT NULL COMMENT '登録日時 : レコードが登録された日時',
	REGISTER_USER VARCHAR(200) NOT NULL COMMENT '登録ユーザー : レコードを登録したユーザー',
	UPDATE_DATETIME DATETIME NOT NULL COMMENT '更新日時 : レコードが(最後に)更新された日時',
	UPDATE_USER VARCHAR(200) NOT NULL COMMENT '更新ユーザー : レコードを(最後に)更新したユーザー',
	VERSION_NO BIGINT NOT NULL COMMENT 'バージョン番号 : 排他制御用、更新されるごとにインクリメントされる',
	PRIMARY KEY (MEMBER_ID)
) COMMENT = 'メンバー : 会員のプロフィールやアカウントなどの基本情報を保持する。基本的に物理削除はなく、退会したらステータスが退会会員になる。ライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。';


CREATE TABLE MEMBER_ACCESS_TOKEN
(
	MEMBER_ACCESS_TOKEN_ID BIGINT NOT NULL AUTO_INCREMENT COMMENT 'メンバーアクセストークンID',
	MEMBER_ID BIGINT NOT NULL UNIQUE COMMENT 'メンバーID',
	ACCESS_TOKEN CHAR(64) NOT NULL UNIQUE COMMENT 'アクセストークン',
	REGISTER_DATETIME DATETIME NOT NULL COMMENT '登録日時 : レコードが登録された日時',
	REGISTER_USER VARCHAR(200) NOT NULL COMMENT '登録ユーザー : レコードを登録したユーザー',
	UPDATE_DATETIME DATETIME NOT NULL COMMENT '更新日時 : レコードが(最後に)更新された日時',
	UPDATE_USER VARCHAR(200) NOT NULL COMMENT '更新ユーザー : レコードを(最後に)更新したユーザー',
	PRIMARY KEY (MEMBER_ACCESS_TOKEN_ID)
) COMMENT = 'メンバーアクセストークン : 本来であれば redis になって変わるテーブルです。';


CREATE TABLE MEMBER_STATUS
(
	MEMBER_STATUS_CODE CHAR(3) NOT NULL COMMENT 'メンバーステータスコード : 会員ステータスを識別するコード。固定的なデータなので連番とか番号にはせず、データを直接見たときも人が直感的にわかるように、例えば "FML" とかの３桁のコード形式にしている。(3って何会員だっけ？とかの問答をやりたくないので)',
	MEMBER_STATUS_NAME VARCHAR(50) NOT NULL COMMENT 'メンバーステータス名 : 表示用の名称。国際化対応するときはもっと色々考える必要があるかと...ということで英語名カラムがないので、そのまま区分値メソッド名の一部としても利用される。',
	DESCRIPTION VARCHAR(200) NOT NULL COMMENT '説明 : 会員ステータスそれぞれの説明。区分値の一つ一つの要素に気の利いた説明があるとディベロッパーがとても助かるので絶対に欲しい。',
	DISPLAY_ORDER INT NOT NULL UNIQUE COMMENT '表示順 : UI上のステータスの表示順を示すNO。並べるときは、このカラムに対して昇順のソート条件にする。',
	PRIMARY KEY (MEMBER_STATUS_CODE)
) COMMENT = '会員ステータス : 会員のステータスを示す固定的なマスタテーブル。いわゆるテーブル区分値！業務運用上で増えることはなく、増減するときはプログラム修正ともなうレベルの業務変更と考えられる。こういった固定的なマスタテーブルには、更新日時などの共通カラムは定義していないが、業務上そういった情報を管理する必要性が低いという理由に加え、ExampleDBとして共通カラムでER図が埋め尽くされてしまい見づらくなるというところで割り切っている。実業務では統一的に定義することもある。';


CREATE TABLE PROJECT
(
	PROJECT_ID BIGINT NOT NULL AUTO_INCREMENT COMMENT 'プロジェクトID',
	MEMBER_ID BIGINT NOT NULL COMMENT 'メンバーID : プロジェクトを作成したメンバーのID',
	PROJECT_NAME VARCHAR(256) NOT NULL COMMENT 'プロジェクト名',
	PROJECT_DETAIL TEXT NOT NULL COMMENT 'プロジェクト詳細',
	REGISTER_DATETIME DATETIME NOT NULL COMMENT '登録日時 : レコードが登録された日時',
	REGISTER_USER VARCHAR(200) NOT NULL COMMENT '登録ユーザー : レコードを登録したユーザー',
	UPDATE_DATETIME DATETIME NOT NULL COMMENT '更新日時 : レコードが(最後に)更新された日時',
	UPDATE_USER VARCHAR(200) NOT NULL COMMENT '更新ユーザー : レコードを(最後に)更新したユーザー',
	VERSION_NO BIGINT NOT NULL COMMENT 'バージョン番号 : 排他制御用、更新されるごとにインクリメントされる',
	PRIMARY KEY (PROJECT_ID)
) COMMENT = 'プロジェクト';


CREATE TABLE PROJECT_MEMBER
(
	PROJECT_MEMBER_ID BIGINT NOT NULL AUTO_INCREMENT COMMENT 'プロジェクトメンバーID',
	PROJECT_ID BIGINT NOT NULL COMMENT 'プロジェクトID',
	MEMBER_ID BIGINT NOT NULL COMMENT 'メンバーID',
	DEL_FLG BOOLEAN NOT NULL COMMENT '削除フラグ',
	REGISTER_DATETIME DATETIME NOT NULL COMMENT '登録日時 : レコードが登録された日時',
	REGISTER_USER VARCHAR(200) NOT NULL COMMENT '登録ユーザー : レコードを登録したユーザー',
	UPDATE_DATETIME DATETIME NOT NULL COMMENT '更新日時 : レコードが(最後に)更新された日時',
	UPDATE_USER VARCHAR(200) NOT NULL COMMENT '更新ユーザー : レコードを(最後に)更新したユーザー',
	PRIMARY KEY (PROJECT_MEMBER_ID),
	CONSTRAINT UQ_PROJECT_MENBER_PROJECT_ID_MEMBER_ID UNIQUE (PROJECT_ID, MEMBER_ID)
) COMMENT = 'プロジェクトメンバー';


CREATE TABLE TICKET
(
	TICKET_ID BIGINT NOT NULL AUTO_INCREMENT COMMENT 'チケットID',
	PARENT_TICKET_ID BIGINT COMMENT '親チケットID',
	MEMBER_ID BIGINT NOT NULL COMMENT 'メンバーID : タスクを作成したメンバーのID',
	ASSIGNEED_MEMBER_ID BIGINT NOT NULL COMMENT '担当メンバーID : タスクの担当者のメンバーID',
	TICKET_TYPE_ID BIGINT NOT NULL COMMENT 'チケットタイプID',
	TICKET_STATUS_ID BIGINT NOT NULL COMMENT 'チケットステータスID',
	PROJECT_ID BIGINT NOT NULL COMMENT 'プロジェクトID',
	TICKET_NAME VARCHAR(256) NOT NULL COMMENT 'チケット名',
	TICKET_DETAIL TEXT NOT NULL COMMENT 'チケット詳細 : チケットの詳細を書き込むためのフィールドです',
	REGISTER_DATETIME DATETIME NOT NULL COMMENT '登録日時 : レコードが登録された日時',
	REGISTER_USER VARCHAR(200) NOT NULL COMMENT '登録ユーザー : レコードを登録したユーザー',
	UPDATE_DATETIME DATETIME NOT NULL COMMENT '更新日時 : レコードが(最後に)更新された日時',
	UPDATE_USER VARCHAR(200) NOT NULL COMMENT '更新ユーザー : レコードを(最後に)更新したユーザー',
	VERSION_NO BIGINT NOT NULL COMMENT 'バージョン番号 : 排他制御用、更新されるごとにインクリメントされる',
	PRIMARY KEY (TICKET_ID)
) COMMENT = 'チケット : タスクが格納されるチケットです。';


CREATE TABLE TICKET_STATUS
(
	TICKET_STATUS_ID BIGINT NOT NULL AUTO_INCREMENT COMMENT 'チケットステータスID',
	PROJECT_ID BIGINT NOT NULL COMMENT 'プロジェクトID',
	TICKET_STATUS_NAME VARCHAR(128) NOT NULL COMMENT 'チケットステータス名',
	TICKET_STATUS_ICON VARCHAR(128) NOT NULL COMMENT 'チケットステータスアイコン : http://fontawesome.io/icons/ を参考に',
	DEL_FLG BOOLEAN NOT NULL COMMENT '削除フラグ',
	REGISTER_DATETIME DATETIME NOT NULL COMMENT '登録日時 : レコードが登録された日時',
	REGISTER_USER VARCHAR(200) NOT NULL COMMENT '登録ユーザー : レコードを登録したユーザー',
	UPDATE_DATETIME DATETIME NOT NULL COMMENT '更新日時 : レコードが(最後に)更新された日時',
	UPDATE_USER VARCHAR(200) NOT NULL COMMENT '更新ユーザー : レコードを(最後に)更新したユーザー',
	PRIMARY KEY (TICKET_STATUS_ID),
	CONSTRAINT UQ_TICKET_STATUS_PROJECT_ID_TICKET_STATUS_NAME UNIQUE (PROJECT_ID, TICKET_STATUS_NAME)
) COMMENT = 'チケットステータス';


CREATE TABLE TICKET_TYPE
(
	TICKET_TYPE_ID BIGINT NOT NULL AUTO_INCREMENT COMMENT 'チケットタイプID',
	PROJECT_ID BIGINT NOT NULL COMMENT 'プロジェクトID',
	TICKET_TYPE_NAME VARCHAR(128) NOT NULL COMMENT 'チケットタイプ名',
	TICKET_TYPE_ICON VARCHAR(128) NOT NULL COMMENT 'チケットタイプアイコン',
	DEL_FLG BOOLEAN NOT NULL COMMENT '削除フラグ',
	REGISTER_DATETIME DATETIME NOT NULL COMMENT '登録日時 : レコードが登録された日時',
	REGISTER_USER VARCHAR(200) NOT NULL COMMENT '登録ユーザー : レコードを登録したユーザー',
	UPDATE_DATETIME DATETIME NOT NULL COMMENT '更新日時 : レコードが(最後に)更新された日時',
	UPDATE_USER VARCHAR(200) NOT NULL COMMENT '更新ユーザー : レコードを(最後に)更新したユーザー',
	PRIMARY KEY (TICKET_TYPE_ID),
	CONSTRAINT UQ_TICKET_TYPE_PROJECT_ID_TICKET_TYPE_NAME UNIQUE (PROJECT_ID, TICKET_TYPE_NAME)
) COMMENT = 'チケットタイプ';



/* Create Indexes */

CREATE INDEX IX_MEMBER_MEMBER_NAME USING BTREE ON MEMBER (MEMBER_NAME ASC);
CREATE INDEX IX_MEMBER_ACCESS_TOKEN_ACCESS_TOKEN USING BTREE ON MEMBER_ACCESS_TOKEN (ACCESS_TOKEN ASC);



/* Create Foreign Keys */

ALTER TABLE MEMBER_ACCESS_TOKEN
	ADD CONSTRAINT FK_MEMBER_ACCESS_TOKEN_MEMBER FOREIGN KEY (MEMBER_ID)
	REFERENCES MEMBER (MEMBER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE PROJECT
	ADD CONSTRAINT FK_PROJECT_MEMBER FOREIGN KEY (MEMBER_ID)
	REFERENCES MEMBER (MEMBER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE PROJECT_MEMBER
	ADD CONSTRAINT FK_PROJECT_MEMBER_MEMBER FOREIGN KEY (MEMBER_ID)
	REFERENCES MEMBER (MEMBER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TICKET
	ADD CONSTRAINT FK_TICKET_MEMBER FOREIGN KEY (MEMBER_ID)
	REFERENCES MEMBER (MEMBER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TICKET
	ADD CONSTRAINT FK_TICKET_ASIGNEED_MEMBER FOREIGN KEY (ASSIGNEED_MEMBER_ID)
	REFERENCES MEMBER (MEMBER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE MEMBER
	ADD CONSTRAINT FK_MEMBER_MEMBER_STATUS FOREIGN KEY (MEMBER_STATUS_CODE)
	REFERENCES MEMBER_STATUS (MEMBER_STATUS_CODE)
	ON UPDATE NO ACTION
	ON DELETE NO ACTION
;


ALTER TABLE PROJECT_MEMBER
	ADD CONSTRAINT FK_PROJECT_MEMBER_PROJECT FOREIGN KEY (PROJECT_ID)
	REFERENCES PROJECT (PROJECT_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TICKET
	ADD CONSTRAINT FK_TICKET_PROJECT FOREIGN KEY (PROJECT_ID)
	REFERENCES PROJECT (PROJECT_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TICKET_STATUS
	ADD CONSTRAINT FK_TICKET_STATUS_PROJECT FOREIGN KEY (PROJECT_ID)
	REFERENCES PROJECT (PROJECT_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TICKET_TYPE
	ADD CONSTRAINT FK_TICKET_TYPE_PROJECT FOREIGN KEY (PROJECT_ID)
	REFERENCES PROJECT (PROJECT_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TICKET
	ADD CONSTRAINT FK_TICKET_SELF FOREIGN KEY (PARENT_TICKET_ID)
	REFERENCES TICKET (TICKET_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TICKET
	ADD CONSTRAINT FK_TICKET_TICKET_STATUS FOREIGN KEY (TICKET_STATUS_ID)
	REFERENCES TICKET_STATUS (TICKET_STATUS_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TICKET
	ADD CONSTRAINT FK_TICKET_TICKET_TYPE FOREIGN KEY (TICKET_TYPE_ID)
	REFERENCES TICKET_TYPE (TICKET_TYPE_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



