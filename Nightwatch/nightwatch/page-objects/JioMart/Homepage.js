const commands = {
    clickOnSearchButton: function() {
      return this
        .waitForElementVisible('@SearchBar') // Wait for the search bar to be visible
        .click('@SearchBar'); // Click on the search bar
    },
    // clickfirstproduct: async function(){
    //   await browser.waitForElementVisible('@FirstSearchResult')
    //   // await browser.waitForElementVisible(".material-symbols-outlined.hex", 5000);
    //   // .click('@FirstSearchResult')
    // }
  };
  
  module.exports = {
    commands: [commands],
    elements: {
      SearchBar: {
        selector: '.aa-Input.search_input',
        locateStrategy: 'css selector', // Specify the locator strategy
      },
      FirstSearchResult: {
        selector: '#autocomplete-0-suggestions-list .aa-Item:first-child', // clicking on the first Product item
        locateStrategy: 'css selector', 
      },
    },
  };
  