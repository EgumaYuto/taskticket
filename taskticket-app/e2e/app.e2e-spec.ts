import { TaskticketAppPage } from './app.po';

describe('taskticket-app App', () => {
  let page: TaskticketAppPage;

  beforeEach(() => {
    page = new TaskticketAppPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
