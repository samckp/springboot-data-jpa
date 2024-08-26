# springboot-data-jpa

POST : localhost:8080/placeOrder
Body / Json
{
"customer": {
"name": "Raj",
"email": "Raja@gmail.com",
"gender": "Male",
"products": [
{
"pid": 401,
"productName": "Mobile",
"price": 60000,
"qty": 2
},
{
"pid": 702,
"productName": "iPad",
"price": 40000,
"qty": 1
}
]
}
}
GET : localhost:8080/orders

GET : localhost:8080/orderInfo

Swagger url: http://localhost:8080/swagger-ui/index.html#/
