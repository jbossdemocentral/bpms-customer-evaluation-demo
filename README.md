JBoss BPM Suite Customer Evaluation Demo
========================================


Quickstart
----------

1. Clone project.

2. Add products to installs directory.

3. Run 'init.sh'.

4. Login to http://localhost:8080/business-central  (u:erics / p:bpmsuite).

5. Customer Evaluation demo pre-installed as project.

6. Process and Task dashboard pre-filled with mock data.

7. Read the documentation found in the docs directory & enjoy JBoss BPM Suite!


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

- v0.6 - with JBoss EAP 6.1.1, JBoss BPM Suite 6.0.0.CR1, and migrated JBDS project from BRMS 5.3.

- v0.5 with JBoss EAP 6.1.1, JBoss BPM Suite 6.0.0.Beta, mock data populated in Process and Task dashboard, and migrated JBDS project from BRMS 5.3.

- v0.4 with JBoss EAP 6.1.1, JBoss BPM Suite 6.0.0.Beta, migrated JBDS project from BRMS 5.3.

- v0.3 with JBoss EAP 6.1, JBoss BPM Suite 6.0.0.ER5, migrated JBDS project from BRMS 5.3, and full documentation.

- v0.2 with JBoss EAP 6.1, JBoss BPM Suite 6.0.0.ER5, and migrated JBDS project from BRMS 5.3.

- v0.1 with JBoss EAP 6.1, JBoss BPM Suite 6.0.0.Beta1, and migrated JBDS project from BRMS 5.3.


![Install Console](https://github.com/eschabell/bpms-customer-evaluation-demo/blob/master/docs/demo-images/install-console.png?raw=true)

![Process](https://github.com/eschabell/bpms-customer-evaluation-demo/blob/master/docs/demo-images/process.png?raw=true)

![Process & Task Dashboard](https://github.com/eschabell/bpms-customer-evaluation-demo/blob/master/docs/demo-images/mock-bpm-data.png?raw=true)

