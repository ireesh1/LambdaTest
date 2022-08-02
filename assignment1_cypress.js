describe("Login page", () => {
    it("successfully loads", () => {
      cy.visit("/");
    });

    it("Slider", () => {
        //Login with valid credentials
       cy.contains('Progress Bars & Sliders').click();
       cy.contains('Drag & Drop Sliders').click();
      

    cy.get('output#rangeSuccess').invoke('val', 95);
     cy.get('input[type=range]').eq(2).as('range').invoke('val', 95).trigger('mouseover')
    .wait(5000);

    cy.get('output#rangeSuccess').should("have.value", '95');

    });
});