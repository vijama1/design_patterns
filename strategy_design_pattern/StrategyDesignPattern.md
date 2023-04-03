1. Lets say I have a vehicle class which conatins a drive method.
2. There are many child classes of vehicle class which write their own drive class implementation.
3. There might be a scenario where two or more classes end up in writing a same implementation.
4. That violates the principle of code reusability.
5. To avoid that we can create an interface(strategy) which contains a drive method and their can be different implementation of that interface.
6. In the vehicle class we can create an object of interface and assign a value to it in constructor using constructor injection.
7. Now in the child classes, each child class can call constructor of parent class using the interface implementation(normal drive or luxury drive in our case).