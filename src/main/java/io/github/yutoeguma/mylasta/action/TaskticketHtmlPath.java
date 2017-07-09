/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package io.github.yutoeguma.mylasta.action;

import org.lastaflute.web.response.next.HtmlNext;

/**
 * The path definition of HTML.
 * @author FreeGen
 */
public interface TaskticketHtmlPath {

    /** The path of the HTML: /error/show_errors.html */
    HtmlNext path_Error_ShowErrorsHtml = new HtmlNext("/error/show_errors.html");

    /** The path of the HTML: /index.html */
    HtmlNext path_IndexHtml = new HtmlNext("/index.html");

    /** The path of the HTML: /login/login.html */
    HtmlNext path_Login_LoginHtml = new HtmlNext("/login/login.html");

    /** The path of the HTML: /mypage/mypage.html */
    HtmlNext path_Mypage_MypageHtml = new HtmlNext("/mypage/mypage.html");

    /** The path of the HTML: /root.html */
    HtmlNext path_RootHtml = new HtmlNext("/root.html");

    /** The path of the HTML: /ticket/index.html */
    HtmlNext path_Ticket_IndexHtml = new HtmlNext("/ticket/index.html");
}
