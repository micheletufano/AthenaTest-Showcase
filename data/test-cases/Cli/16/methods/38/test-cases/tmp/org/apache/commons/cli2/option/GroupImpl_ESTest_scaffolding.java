/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Dec 01 02:06:08 GMT 2020
 */

package org.apache.commons.cli2.option;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class GroupImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.cli2.option.GroupImpl"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/tufanodata/work/defects4j-unit-test/code"); 
    java.lang.System.setProperty("user.home", "/home/mitufano"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "mitufano"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GroupImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.cli2.option.ParentImpl",
      "org.apache.commons.cli2.option.ReverseStringComparator",
      "org.apache.commons.cli2.validation.Validator",
      "org.apache.commons.cli2.validation.UrlValidator",
      "org.apache.commons.cli2.validation.InvalidArgumentException",
      "org.apache.commons.cli2.option.DefaultOption",
      "org.apache.commons.cli2.validation.NumberValidator",
      "org.apache.commons.cli2.CommandLine",
      "org.apache.commons.cli2.validation.EnumValidator",
      "org.apache.commons.cli2.option.PropertyOption",
      "org.apache.commons.cli2.Parent",
      "org.apache.commons.cli2.commandline.WriteableCommandLineImpl",
      "org.apache.commons.cli2.validation.DateValidator",
      "org.apache.commons.cli2.commandline.CommandLineImpl",
      "org.apache.commons.cli2.WriteableCommandLine",
      "org.apache.commons.cli2.option.ArgumentImpl",
      "org.apache.commons.cli2.DisplaySetting",
      "org.apache.commons.cli2.Argument",
      "org.apache.commons.cli2.Option",
      "org.apache.commons.cli2.option.SourceDestArgument",
      "org.apache.commons.cli2.option.Switch",
      "org.apache.commons.cli2.option.Command",
      "org.apache.commons.cli2.OptionException",
      "org.apache.commons.cli2.validation.ClassValidator",
      "org.apache.commons.cli2.resource.ResourceHelper",
      "org.apache.commons.cli2.option.OptionImpl",
      "org.apache.commons.cli2.Group",
      "org.apache.commons.cli2.option.GroupImpl",
      "org.apache.commons.cli2.validation.FileValidator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Comparator", false, GroupImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.ListIterator", false, GroupImpl_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GroupImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.cli2.option.OptionImpl",
      "org.apache.commons.cli2.option.GroupImpl",
      "org.apache.commons.cli2.option.ReverseStringComparator",
      "org.apache.commons.cli2.DisplaySetting",
      "org.apache.commons.cli2.option.PropertyOption",
      "org.apache.commons.cli2.commandline.CommandLineImpl",
      "org.apache.commons.cli2.commandline.WriteableCommandLineImpl",
      "org.apache.commons.cli2.option.ArgumentImpl",
      "org.apache.commons.cli2.option.SourceDestArgument",
      "org.apache.commons.cli2.validation.FileValidator",
      "org.apache.commons.cli2.resource.ResourceHelper",
      "org.apache.commons.cli2.OptionException",
      "org.apache.commons.cli2.validation.DateValidator",
      "org.apache.commons.cli2.validation.EnumValidator",
      "org.apache.commons.cli2.validation.NumberValidator",
      "org.apache.commons.cli2.option.ParentImpl",
      "org.apache.commons.cli2.option.Command",
      "org.apache.commons.cli2.validation.UrlValidator",
      "org.apache.commons.cli2.validation.ClassValidator",
      "org.apache.commons.cli2.option.Switch",
      "org.apache.commons.cli2.option.DefaultOption"
    );
  }
}
