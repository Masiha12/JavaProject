package com.syntax.Replit;

public class Replit88 {
/*In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().

Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

The output of the program should be as following:

 

```
Husky can bark
```

```
Husky can run
```

```
Husky can play
```

```
Bulldog can bark
```

```
Bulldog can run
```

```
Bulldog can play
```

```
Labrador can bark
```
 * 
 */
	
	
	
String name;
String color;
String breed;

void bark() {
	System.out.println(breed + " can bark");

}

void run() {
	System.out.println(breed+" can run");
}

void play() {
	System.out.println(breed+"can play");
}

public static void main(String[] args) {

	
	Replit88 dog = new Replit88();
	dog.breed = "Husky";
	dog.bark();
	dog.run();
	dog.play();
	Replit88 dog1 = new Replit88();

	dog1.breed = "Bulldog";
	dog1.bark();
     dog1.run();
     dog1.play();
	Replit88 dog2 = new Replit88();
	dog2.breed = "labrador";
	dog2.bark();
	dog2.run();
	dog2.play();
}

}
