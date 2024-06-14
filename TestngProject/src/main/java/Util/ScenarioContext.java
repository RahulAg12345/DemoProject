package Util;

import java.util.Map;

public class ScenarioContext {
	
	private static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<Map<String, Object>>();
	private static ScenarioContext scenariocontext = new ScenarioContext();
	
	private ScenarioContext() {
		
	}
	
	public static ScenarioContext getScenarioContextInstance() {
		return scenariocontext;
	}
	
	public void setContext(String key, Object value) {
		threadLocal.get().put(key, value);
	}
	
	public void setUp(Map <String, Object> context) {
		
		threadLocal.set(context);
	}
	
	public Object getContext(String key) {
		return threadLocal.get().get(key);
	}
	
	
	public Boolean ContainsKey(String key) {
		return threadLocal.get().containsKey(key);
	}
	
	public void ClearContext() {
		threadLocal.get().clear();;
	}
	
	
	
	
	
	

}
