package com.sabbarwar.soap.webservices.soapcoursemanagement.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.sabbarwar.courses.CourseDetails;
import com.sabbarwar.courses.GetCourseDetailsRequest;
import com.sabbarwar.courses.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndpoint {

	//method
	//input - GetCourseDetailsRequest
	//output - GetCourseDetailsResponse
	@PayloadRoot(namespace="http://sabbarwar.com/courses",localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse
		processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {
		GetCourseDetailsResponse response=new GetCourseDetailsResponse();
		CourseDetails courseDetails=new CourseDetails();
		//courseDetails.setId(request.getId());
		courseDetails.setId(456);
		courseDetails.setName("MicroServices Course");
		courseDetails.setDescription("Wonderful course");
		response.setCourseDetails(courseDetails);
		return response;
	}
	
}
