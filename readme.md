# Payroll System

A web application using Spring with N-Tier architecture

## setup database

```
docker run --name payroll-system-db -p 3306:3306 -e MYSQL_ROOT_PASSWORD=mypass123 -d mysql:8.0.1
docker run --name payroll-system-phpmyadmin -d --link payroll-system-db:db -p 8081:80 phpmyadmin/phpmyadmin
```