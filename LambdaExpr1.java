package com.infinite.newfeatures;

interface IHello{
	void sayHello();
}

public class LambdaExpr1 {
	
public static void main(String[] args) {
	IHello obj1 = () -> {
		System.out.println("Welcomr to JDK 1.8 new Features...");
	};
	obj1.sayHello();
  }
}
