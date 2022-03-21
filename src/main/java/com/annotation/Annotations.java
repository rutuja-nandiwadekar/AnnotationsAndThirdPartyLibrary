package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Annotations {
	@Deprecated
	@MethodInfo(comment = "This is deprecated method, Don't use it", date = "4th Jan, 2022")
	public void oldMethod() {
		System.out.println("Old method decalration");
	}

	@Override
	@MethodInfo(comment = "toString method overriden", date = "4th Jan, 2022")
	public String toString() {
		return "Demo str from AnnonationExample";
	}

	public static void main(String[] args) {

		for (Method method : Annotations.class.getMethods()) {
			for (Annotation annotation : method.getAnnotations()) {
				if (method.isAnnotationPresent(MethodInfo.class)) {
					System.out.println(method + "\t" + annotation);

					MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
					System.out.println("Author : " + methodInfo.author());
					System.out.println("Revision : " + methodInfo.revision());
					System.out.println("comment : " + methodInfo.comment());
					System.out.println("date : " + methodInfo.date());
				}
			}
		}

	}
}
