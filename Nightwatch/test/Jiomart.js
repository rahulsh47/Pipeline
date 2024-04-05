describe('Jiomart Search', function() {
  const homePage = browser.page.JioMart.Homepage() // first page-object

  beforeEach(async () => homePage.navigate());

  afterEach(async (browser) => browser.quit());

  it('1. Verify that user should able to search available product',async function(browser) {
    homePage.setValue('.aa-Input.search_input', 'iphone 15');
    // browser.waitForElementVisible('.aa-Input.search_input');
    // // homePage.clickfirstproduct();
    // await browser.execute(
    //   document.querySelector('#autocomplete-0-suggestions-list .aa-Item:first-child').click();
    // );

    await browser.waitForElementVisible("#autocomplete-0-suggestions-list .aa-Item:first-child", 5000);
    await browser.execute(
      'document.querySelector("#autocomplete-0-suggestions-list .aa-Item:first-child").click();'
    );
    // homePage.assert.textContains('.jio-web.search-result-page.alg.srch.master', 'Filters');

    // homePage.browser.assert.urlEquals('iphone%2013')
    // browser.pause();


    browser.assert.urlContains('https://www.jiomart.com/search/iphone/in/prod_mart_master_vertical');
  });

  it('2. Verify that the user should not be able to search Unavailable product',async function(browser){
    homePage.setValue('.aa-Input.search_input', 'Nokia 3110');
    // homePage.clickfirstproduct();
    // await browser.waitForElementVisible("#autocomplete-0-suggestions-list .aa-Item:first-child", 5000);
    await browser.execute(
      'document.querySelector("#autocomplete-0-suggestions-list .aa-Item:first-child").click();'
    );
    
    // homePage.assert.textContains('.jio-web.search-result-page.alg.srch.master', 'Filters');
    browser.assert.not.urlContains('nokia/in/prod_mart_master_vertical');
  })
});
