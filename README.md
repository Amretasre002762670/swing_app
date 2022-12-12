# ONLINE DELIVERY SYSTEM

 ### Team Memebers ###
 1. AMRETASRE RENGARAJAN THIRUVENGADAM (002762670)
 2. NAGA VAISHNAVI PUPPALA (002797549)
 3. SRADDHA PEDDA GANGIREDDY GARI (002743943)


### Class Diagram of ONLINE DELIVERY SYSTEM
![CLASS DIAGRAM](https://user-images.githubusercontent.com/114785407/206961070-25584c0b-25af-4729-a1fd-3f2aab662142.jpeg)
 
 
 
### Database UML diagram
![db uml diagram](https://user-images.githubusercontent.com/114785407/206961369-f12be633-658e-4f29-bb2b-8bf34b337a8d.jpeg)



## Panel Sequence Diagram ##

### SYSTEM ADMIN PANEL SEQUENCE DIAGRAM ###
<img width="388" alt="image" src="https://user-images.githubusercontent.com/113134320/206952821-843f929a-b11e-43e2-a9f9-89b5e6bea354.png">

### RESTAURANT ADMIN PANEL SEQUENCE DIAGRAM ###
<img width="468" alt="image" src="https://user-images.githubusercontent.com/113134320/206952891-abcdd611-cede-4406-894c-a6fbae0eb96f.png">

### CUSTOMER PANEL SEQUENCE DIAGRAM ###
<img width="477" alt="image" src="https://user-images.githubusercontent.com/113134320/206952964-38c44d79-aaed-4a8e-863b-556ac97fb08d.png">

### DELIVERY MAN PANEL SEQUENCE DIAGRAM ###
<img width="488" alt="image" src="https://user-images.githubusercontent.com/113134320/206953067-ef326078-ae39-473d-ac3a-262f2f19580a.png">




CONTEXT:
Online food delivery system is a Java Swing application with GUI which acts as a platform for people to find restaurants in specific areas and order food and track status of the order.

APPLICATION WORKFLOW:
Upon login, every user is shown a different page, menu, and options, depending on the user permissions. 


Using the application, The System Admin can perform all the functions. He can add customer, delivery man, restaurants and perform management functions such as removing, viewing, and updating their information.

A customer can login and search for a specific restaurant according to the type or area and after selecting a restaurant, can navigate through the restaurant menu, view the menu, and add menu items to the cart. He can view his order summary and proceed to checkout for payment. After the order is successfully placed, he can even track the current order status and get delivery man details.

A delivery man can login, check the pending orders in the queue and accept an order and can update the current order status. He can also view the customer and restaurant details with respective to that order.

A restaurant admin can login, navigate to the work area and manage menu, orders. He can add new items into the menu and update or delete menu items. And can check the order status and update the order status. Restaurant admin can also view the details of the customer and delivery man of that specific order.

CRUD operations are implemented based on the user who has logged in. for example, a customer or delivery person cannot perform CRUD functions. A restaurant admin has limited CRUD permissions as he can only add/update/delete menu items in menu but have no access to managerial functions of delivery person. System Admin has all the privileges to CRUD operations. 



Functionalities of the Project
-	Provides the searching facilities based on the restaurant type and address.
-	It manages delivery details, order details and customer details.
-	Managing the information of the food item, category, and restaurant.
-	Sends an email confirmation to the customer after the order is successfully placed.
-	Customer can track the real-time status of the order.


DATABASE:
We have used MySQL database.
Database Name: Online delivery system
Tables: UseraccountDirectory, CustomerDirectory,RestaurantAdminDirectory,RestaurantDirectory,
Menudirectory,OrderDirectory,OrderMenuRelation.

![image](https://user-images.githubusercontent.com/113550284/206954374-27a7394c-d547-49a6-925b-2cfa69bbea16.png)
