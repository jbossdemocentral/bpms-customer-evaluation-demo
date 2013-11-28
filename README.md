JBoss BPM Suite Customer Evaluation Demo
========================================

![Install Console](https://github.com/eschabell/bpms-customer-evaluation-demo/blob/master/docs/demo-images/install-console.png?raw=true)

![Process](https://github.com/eschabell/bpms-customer-evaluation-demo/blob/master/docs/demo-images/process.png?raw=true)


Quickstart
----------

1. Clone project.

2. Add products to installs directory.

3. Run 'init.sh'.

4. Login to http://localhost:8080/business-central  (u:erics / p:bpmsuite).

5. Enjoy JBoss BPM Suite!

The project is NOT installed into the JBoss BPM Suite GUI, this is a JBoss
Developer Studio developer based demo. It shows how a project looks, feels,
and can be unit tested as a developer would work with this type of project.

6. Install JBoss Developer Studio (JBDS) if needed from Customer Portal.

7. Import a new maven project in JBDS, select projects/customer-evaluation-demo directory.

8. Examine the project files; a model, a rule file, a bpmn2 process file, and the unit test file.

9. Run unit test, see output in console and JUnit tab.

10. Can also run 'mvn test' in projects/customer-evaluation-demo directory to see unit tests (4x).

Released versions
-----------------

See the tagged releases for the following versions of the product:

- v0.2 with JBoss EAP 6.1, JBoss BPM Suite 6.0.0.ER5, and migrated JBDS project from BRMS 5.3.

- v0.1 with JBoss EAP 6.1, JBoss BPM Suite 6.0.0.Beta1, and migrated JBDS project from BRMS 5.3.
