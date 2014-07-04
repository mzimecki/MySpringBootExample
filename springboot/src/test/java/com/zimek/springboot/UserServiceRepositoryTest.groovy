package com.zimek.springboot

import groovy.json.JsonSlurper
import groovyx.net.http.RESTClient
import spock.lang.Specification

import com.zimek.springboot.service.User

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
}
