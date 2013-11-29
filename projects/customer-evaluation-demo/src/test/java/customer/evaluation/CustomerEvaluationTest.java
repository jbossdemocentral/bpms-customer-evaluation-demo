package customer.evaluation;

import java.util.HashMap;
import java.util.Map;

import org.jbpm.test.JbpmJUnitBaseTestCase;
import org.jbpm.workflow.instance.WorkflowProcessInstance;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.internal.runtime.manager.context.ProcessInstanceIdContext;

import customer.evaluation.Person;
import customer.evaluation.Request;

/**
 * This is a sample file to launch a process.
 */
public class CustomerEvaluationTest extends JbpmJUnitBaseTestCase {

	private static Integer underAged    = 11;
	private static Integer adultAged    = 25;
	private static Integer richCustomer = 2000; // greater than 999.
	private static Integer poorCutomer  = 2;
	private static RuntimeEngine runtime;
	
	@Before
	public void setUp() {
		Map<String, ResourceType> resources = new HashMap<String, ResourceType>();
		resources.put("customereval.bpmn2", ResourceType.BPMN2);
		resources.put("financerules.drl", ResourceType.DRL);
		
		createRuntimeManager(Strategy.SINGLETON, resources);
		runtime = getRuntimeEngine(ProcessInstanceIdContext.get());
	}
	
	@After
	public void tearDown() {
		disposeRuntimeManager();
	}
	
	@Test
	public void underagedCustomerEvaluationTest() {
		// setup of a Person and Request.
		Person underagedEval = getUnderagedCustomer();
		Request richEval = getRichCustomer();

		// Map to be passed to the startProcess.
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("person", underagedEval);
		params.put("request", richEval);

		// Fire it up!
		System.out.println("=========================================");
		System.out.println("= Starting Process Underaged Test Case. =");
		System.out.println("=========================================");

		KieSession ksession = runtime.getKieSession();
		ksession.insert(underagedEval);
		ProcessInstance pi = ksession.startProcess("customer.evaluation", params);
		ksession.fireAllRules();

		// Finished.
		assertProcessInstanceCompleted(pi.getId(), ksession);
		assertNodeTriggered(pi.getId(), "Underaged");
		ksession.dispose();

		System.out.println("======================================");
		System.out.println("= Ended Process Underaged Test Case. =");
		System.out.println("======================================");
	}

	@Test
	public void adultCustomerEvaluationTest() {
		KieSession ksession = runtime.getKieSession();
		//KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newThreadedFileLogger(ksession, "CustomerEvaluationPoorAdult", 1000);
	
		// setup of a Person and Request.
		Person adultEval = getAdultCustomer();
		Request poorEval = getPoorCustomer();
		ksession.insert(adultEval);

		// Map to be passed to the startProcess.
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("person", adultEval);
		params.put("request", poorEval);
				
		// Fire it up!
		System.out.println("==========================================");
		System.out.println("= Starting Process Poor Adult Test Case. =");
		System.out.println("==========================================");

		WorkflowProcessInstance processInstance = (WorkflowProcessInstance) ksession.startProcess("customer.evaluation", params);
		ksession.insert(processInstance);
		ksession.fireAllRules();
						
		// Finished, clean up the logger.
		assertProcessInstanceCompleted(processInstance.getId(), ksession);
		assertNodeTriggered(processInstance.getId(), "End Poor Customer");
		//logger.close();
		ksession.dispose();
	}

	@Test
	public void richCustomerEvaluationTest() {
		KieSession ksession = runtime.getKieSession();
	
		// setup of a Person and Request.
		Person adultEval = getAdultCustomer();
		Request richEval = getRichCustomer();
		ksession.insert(adultEval);

		// Map to be passed to the startProcess.
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("person", adultEval);
		params.put("request", richEval);
		
		// Fire it up!
		System.out.println("==========================================");
		System.out.println("= Starting Process Rich Adult Test Case. =");
		System.out.println("==========================================");

		WorkflowProcessInstance processInstance = (WorkflowProcessInstance) ksession.startProcess("customer.evaluation", params);
		ksession.insert(processInstance);
		ksession.fireAllRules();
				
		// Finished, clean up the logger.
		assertProcessInstanceCompleted(processInstance.getId(), ksession);
		assertNodeTriggered(processInstance.getId(), "End Rich Customer");
		//logger.close();
		ksession.dispose();
	}
	
	@Test
	public void emptyRequestCustomerEvaluationTest() {
		KieSession ksession = runtime.getKieSession();
		
		// Map to be passed to the startProcess is intentionally empty.
		Map<String, Object> params = new HashMap<String, Object>();
		
		// Fire it up!
		System.out.println("=============================================");
		System.out.println("= Starting Process Empty Request Test Case. =");
		System.out.println("=============================================");

		WorkflowProcessInstance processInstance = (WorkflowProcessInstance) ksession.startProcess("customer.evaluation", params);
		ksession.insert(processInstance);
		ksession.fireAllRules();
				
		// Finished, clean up the logger.
		assertProcessInstanceCompleted(processInstance.getId(), ksession);
		assertNodeTriggered(processInstance.getId(), "Underaged");
		//logger.close();
		ksession.dispose();
	}

	/**
	 * Provide an under aged person.
	 * 
	 * @return org.jbpm.evaluation.customer.Person
	 */
	private Person getUnderagedCustomer() {
		Person person = new Person("erics", "Eric D. Schabell");
		person.setAge(underAged);
		return person;
	}

	
	/**
	 * Provide an of aged person.
	 * 
	 * @return org.jbpm.evaluation.customer.Person
	 */
	private Person getAdultCustomer() {
		Person person = new Person("erics", "Eric D. Schabell");
		person.setAge(adultAged);
		return person;
	}

	/**
	 * Provide a poor person in the request.
	 * 
	 * @return org.jbpm.evaluation.customer.Request
	 */
	private Request getPoorCustomer() {
		Request request = new Request("1");
		request.setPersonId("erics");
		request.setAmount(poorCutomer);
		return request;
	}

	/**
	 * Provide a rich person in the request.
	 * 
	 * @return org.jbpm.evaluation.customer.Request
	 */
	private Request getRichCustomer() {
		Request request = new Request("1");
		request.setPersonId("erics");
		request.setAmount(richCustomer);
		return request;
	}
}