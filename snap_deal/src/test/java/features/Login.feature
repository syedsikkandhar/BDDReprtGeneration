Feature: Login salesforce edit the account details

Scenario Outline: TC001_login with valid credential and edit the account details

Given Go to <URL>
When Mouse over on toys as <category> 
Then click on toys
When Click <toy_game>
When Click the Customer Rating as <Rating>
When Click the offer as <offer_id>
When Check the availability for the pincode as <pincode>
When Click the Quick View of the first product
When Click on View Details
When Capture the Price of the Product and Delivery charge
When Validate the You Pay amount matches the sum of price and deliver charge
Then Add To Cart
When Search for <product>
When Click on Product <productname>
When Capture the Price and Delivery Charge
When Click on Add to Cart
When Click on Cart
When Validate the Proceed to Pay matches the total amount of both the products
Then Close all the windows

Examples:
|URL|Rating|offer_id|pincode|product|productname|category|toy_game|
|https://www.snapdeal.com/|4 star|40-50|638182|Sanitizer|Vedic Valley Hand Sanitizer 5000 mL Pack of 1|Toys, Kids' Fashion & more|Educational Toys|