JBoss BPM Suite Customer Evaluation Demo
========================================


Quickstart
----------

1. Clone project.

2. Add products to installs directory.

3. Run 'init.sh'.

4. Start JBoss BPMS Server by running 'standalone.sh' or 'standalone.bat' in the <path-to-project>/target/jboss-eap-6.1/bin directory.

5. Login to http://localhost:8080/business-central  (u:erics / p:bpmsuite).

6. Customer Evaluation demo pre-installed as project.

7. Process and Task dashboard pre-filled with mock data optional now. For Windows intaller, to add just uncomment install scripts
	 (see inline script comments).

8. Read the documentation found in the docs directory & enjoy JBoss BPM Suite!


Notes
-----

This project is pre-loaded into the JBoss BPM Suite, after starting it you can login,
examine the rule, process, and data model from within the various product components.
You can then build and deploy the project, thereby generating the kjar maven artifact 
that the developer team needs to begin working on any application using this projects
knowledge artifacts.

Once you setup the project in JBoss Developer Studio (see the docs), you can use maven 
to pull in the kjar dependency, then examine the unit tests to discover how an application
can interact with a knowledge project (rules, processes, and model).


Released versions
-----------------

See the tagged releases for the following versions of the product:

- v0.8 - JBoss BPM Suite 6.0.0.GA, JBoss EAP 6.1.1, and migrated JBDS project from BRMS 5.3.

- v0.7 - JBoss BPM Suite 6.0.0.CR2, JBoss EAP 6.1.1, and migrated JBDS project from BRMS 5.3.

- v0.6 - JBoss BPM Suite 6.0.0.CR1, JBoss EAP 6.1.1, and migrated JBDS project from BRMS 5.3.

- v0.5 - JBoss BPM Suite 6.0.0.Beta, JBoss EAP 6.1.1, mock data populated in Process and Task dashboard, and migrated JBDS project from BRMS 5.3.

- v0.4 - JBoss BPM Suite 6.0.0.Beta, JBoss EAP 6.1.1, migrated JBDS project from BRMS 5.3.

- v0.3 - JBoss BPM Suite 6.0.0.ER5, JBoss EAP 6.1, migrated JBDS project from BRMS 5.3, and full documentation.

- v0.2 - JBoss BPM Suite 6.0.0.ER5, JBoss EAP 6.1, and migrated JBDS project from BRMS 5.3.

- v0.1 - JBoss BPM Suite 6.0.0.Beta1, JBoss EAP 6.1, and migrated JBDS project from BRMS 5.3.


![Install Console](https://github.com/eschabell/bpms-customer-evaluation-demo/blob/master/docs/demo-images/install-console.png?raw=true)

![Process](https://github.com/eschabell/bpms-customer-evaluation-demo/blob/master/docs/demo-images/process.png?raw=true)

![Process & Task Dashboard](https://github.com/eschabell/bpms-customer-evaluation-demo/blob/master/docs/demo-images/mock-bpm-data.png?raw=true)

