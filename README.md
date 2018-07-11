# SpringSecurityJWT
spring boot+spring security+ JWT + Angular 5 mysql Authentication application

This is an learning application allowing us to implement RestFull authentication based on Spring security and Json Web Token.
In this application, users and roles are store in a Mysql database. We created a JWTAuthorization and JWTAuthentication to implement the autorization and authentication filter for control access of users.

The remote client is an Angular 5 app whitch allway sernd the request with credentials for receiving the JWT token. The token is store on a localstorage for a given period and used on any request to the server.

This is a realy working module that manage users access control on a spring application.
