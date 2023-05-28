package com.example.springloginform;

public class ResourceNotFound extends RuntimeException{
	 
	 ResourceNotFound() {
		 super("Record Not Found");
	}
}
