package rocks.nt.apm.jmeter.config.influxdb;

/**
 * Constants (Tag, Field, Measurement) names for the requests measurement.
 * 
 * @author Alexander Wert
 *
 */
public interface RequestMeasurement {

	/**
	 * Measurement name.
	 */
	String MEASUREMENT_NAME = "requestsRaw";

	/**
	 * Tags.
	 * 
	 * @author Alexander Wert
	 *
	 */
	public interface Tags {
		/**
		 * Request name tag.
		 */
    String REQUEST_NAME = "requestName";

		/**
		 * Scenario name tag.
		 */
    String SCENARIO_NAME = "scenarioName";

		/**
		 * Response code field.
		 */
		String RESPONSE_CODE = "responseCode";
	}

	/**
	 * Fields.
	 * 
	 * @author Alexander Wert
	 *
	 */
	public interface Fields {
		/**
		 * Response time field.
		 */
		String RESPONSE_TIME = "responseTime";

		/**
		 * Error count field.
		 */
		String ERROR_COUNT = "errorCount";

		/**
		 * Thread name field
		 */
		String THREAD_NAME = "threadName";

		/**
		 * Test name field
		 */
		String TEST_NAME = "testName";

		/**
		 * Node name field
		 */
		String NODE_NAME = "nodeName";
	}
}
