# Java Security Pipeline Lab9

## CI/CD Status

![CI Security Pipeline](https://github.com/your-username/java-security-pipeline/actions/workflows/ci-security-pipeline.yml/badge.svg)
![Security Scan](https://github.com/your-username/java-security-pipeline/actions/workflows/security-scan.yml/badge.svg)

# local start of security tools
mvn spotbugs:spotbugs
mvn pmd:pmd  
mvn org.owasp:dependency-check-maven:check
