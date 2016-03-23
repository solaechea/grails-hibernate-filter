grails.project.work.dir = 'target'
grails.project.source.level = 1.6
grails.project.dependency.resolver = "maven"

// Private repository for publishing artifacts
grails.project.repos.LAB.url = "https://api.bintray.com/maven/solaechea/solaechea-dev/org.grails.plugins.hibernate-filter/;publish=1"
grails.project.repos.LAB.username = "solaechea"
grails.project.repos.LAB.password = "the key"
grails.project.repos.default = "LAB"


grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
        grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()
	}

	dependencies {}

	plugins {
        compile ":hibernate4:4.3.10"

        build(':release:3.0.1', ':rest-client-builder:2.0.3') {
			export = false
		}
	}
}
