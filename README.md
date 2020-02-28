Technical Evaluation
Food shopping can be hazardous for your health! FDA catalogues press releases of food industry recalls annually, and releases an XML dataset of these recalls, which is published on data.gov. The current dataset ranges from 2009 through 2019, and is available in multiple XML files at https://www.fda.gov/about-fda/open-government-fda-data-sets/recalls-data-sets. 

Your task is to help keep the public safe by creating a “Safe Shopping List” application that can check a user’s grocery list against the FDA recall set and provide the user with recall information relevant to any items on the list. The application should behave as follows:
1.	A web interface accessible via PC or mobile devices allows the user to build or paste in his or her shopping list, either one item at a time or in bulk.
2.	The user clicks a button that says “Check.”
3.	The system searches the recall list for products that match any of the user’s list items. It is sufficient to search Brand Name, Product Description and Company. The search should match whole or partial strings.
4.	The web interface marks each shopping list item that had an associated recall with an indication (x, skull, whatever – have fun) and appends a “details” link.
5.	Clicking the “details” link will show the product recall information onscreen. This information will include the brand name, company name, description and the recall reason (REASON). It will also include the FDA Details URL as a clickable hyperlink labeled “read more…”
