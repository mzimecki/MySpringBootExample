package com.mzimecki.springboot

import groovyx.net.http.HttpResponseException
import groovyx.net.http.RESTClient
import spock.lang.Specification

class UserServiceRepositoryTest extends Specification {
	
	def "should return 200"() {
		setup:
		    def endpoint = new RESTClient('http://localhost:8080/users')
		
		when:
		    def resp = endpoint.post(
			    body : '{"name" : "John"}',
			    requestContentType : 'application/json'
		    )
		
		then:
		    with(resp) {
			    status == 200
		    }
	}

    def "should return 405"() {
        setup:
            def endpoint = new RESTClient("http://localhost:8080/users")
        when:
            def resp = endpoint.get(
                    requestContentType: 'application/json'
            )
        then:
            def e = thrown(HttpResponseException)
            e.message == 'Method Not Allowed'
    }
}
