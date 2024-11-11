package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {


    private static Properties properties = new Properties();
//    private static ThreadLocal<String> browser = ThreadLocal.withInitial(() -> "chrome");  // Default to Chrome if not set    
    
    static {
        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config/config.properties")) {
            if (input == null) {
                throw new RuntimeException("config.properties file not found");
            }
            properties.load(input);
        } catch (IOException ex) {
            throw new RuntimeException("Error loading config.properties file", ex);
        }
    }  

    
    public static void setBrowser(String browserName) {
    	properties.setProperty("browser",browserName);
    }

    public static String getBrowser() {
        return properties.getProperty("browser");
    }
    
    public static String getBaseUrl() {
    	return properties.getProperty("base.url");
    }
    
    public static String getPageLoadTimeout() {
    	return properties.getProperty("page.load.timeout");
    }
    
    public static long getWebDriverWaitTimeout() {
    	return Long.parseLong(properties.getProperty("webdriver.wait.timeout"));
    }
    
    // Login Page URLs
    public static String getLoginUrl() {
    	return properties.getProperty("login.url");
    }
    
    // Login Page URLs
    public static String getHomeUrl() {
    	return properties.getProperty("home.url");
    }
    

	
//  Anjali- Register page URLs
	public static String getRegisterUrl() {
		return properties.getProperty("register.url");
	}

	// Tree Page URLs
	public static String getTreeUrl() {
		return properties.getProperty("tree.url");
	}

	public static String getOverviewOfTreesUrl() {
		return properties.getProperty("tree.overview.of.trees.url");
	}

	public static String getTreeTerminologiesUrl() {
		return properties.getProperty("tree.terminologies.url");
	}

	public static String getTypesOfTreesUrl() {
		return properties.getProperty("tree.types.of.trees");
	}

	public static String getTreeTraversalsUrl() {
		return properties.getProperty("tree.tree.traversals");
	}

	public static String getTreeTraversalsIllustrationsUrl() {
		return properties.getProperty("tree.traversals.illustrations");
	}

	public static String getBinaryTreesUrl() {
		return properties.getProperty("tree.binary.trees");
	}

	public static String getTypesOfBinaryTreesUrl() {
		return properties.getProperty("tree.types.of.binary.trees");
	}

	public static String getTreeImplementationInPythonUrl() {
		return properties.getProperty("tree.implementation.in.python");
	}

	public static String getBinaryTreeTraversalsUrl() {
		return properties.getProperty("tree.binary.tree.traversals");
	}

	public static String getImplementationOfBinaryTreesUrl() {
		return properties.getProperty("tree.implementation.of.binary.trees");
	}

	public static String getApplicationsOfBinaryTreesUrl() {
		return properties.getProperty("tree.applications.of.binary.trees");
	}

	public static String getBinarySearchTreesUrl() {
		return properties.getProperty("tree.binary.search.trees");
	}

	public static String getImplementationOfBstUrl() {
		return properties.getProperty("tree.implementation.of.bst");
	}

	public static String getTreePracticeUrl() {
		return properties.getProperty("tree.practice");
	}

	// Graph Page URLs
	public static String getGraphHomeUrl() {
		return properties.getProperty("graph.home.url");
	}

	public static String getGraphUrl() {
		return properties.getProperty("graph.url");
	}

	public static String getGraphRepresentationsUrl() {
		return properties.getProperty("graph.representations.url");
	}

	public static String getGraphPracticeUrl() {
		return properties.getProperty("graph.practice.url");
	}

	// Try Editor URL
	public static String getTryEditorUrl() {
		return properties.getProperty("try.editor.url");
	}

	// Stack Page URLs
	public static String getStackUrl() {
		return properties.getProperty("stack.url");
	}

	// Queue Page URLs
	public static String getQueueUrl() {
		return properties.getProperty("queue.url");
	}

	// Array Page URLs
	public static String getArrayUrl() {
		return properties.getProperty("array.url");

	}

	public static String getArraysInPythonUrl() {
		return properties.getProperty("array.arrays.in.python.url");

	}

	public static String getArraysUsingListUrl() {
		return properties.getProperty("array.arrays.using.list.url");

	}

	public static String getBasicOperationsInListsUrl() {
		return properties.getProperty("array.basic.operations.in.list.url");

	}

	public static String getApplicationsOfArrayUrl() {
		return properties.getProperty("array.applications.of.array.url");

	}

	public static String getArrayPracticeQuestionsUrl() {
		return properties.getProperty("array.practice.url");

	}

	// Linked List Page URLs
	public static String getLinkedListUrl() {
		return properties.getProperty("linkedlist.linked.list.url");

	}

	public static String getIntroductionUrl() {
		return properties.getProperty("linkedlist.introduction.url");

	}

	public static String getCreatinglinkedListUrl() {
		return properties.getProperty("linkedlist.creating.linked.list.url");

	}

	public static String getTypesOfLinkedListUrl() {
		return properties.getProperty("linkedlist.types.of.linked.list.url");

	}

	public static String getImplementLinkedListInPython() {
		return properties.getProperty("linkedlist.implement.linked.list.in.python");

	}

	public static String getTraversal() {
		return properties.getProperty("linkedlist.traversal.url");
	}

	public static String getInsertion() {
		return properties.getProperty("linkedlist.insertion.url");
	}

	public static String getDeletion() {
		return properties.getProperty("linkedlist.deletion.url");
	}

	public static String getLinkedListPracticeQuestionUrl() {
		return properties.getProperty("linkedlist.practice.questions.url");
	}

	public static String getExcelFilePath() {
		return properties.getProperty("excel.file.path");
	}

	public static String getDataStructuresIntroductionUrl() {
		return properties.getProperty("data.structures.introduction.url");
	}

	public static String getDataStructuresTimeComplexityUrl() {
		return properties.getProperty("data.structures.time.complexity.url");
	}

	public static String getDataStructuresPracticeUrl() {
		return properties.getProperty("data.structures.practice.url");
	}

	public static String getLink(String key) {
		return properties.getProperty(key);
	}
}