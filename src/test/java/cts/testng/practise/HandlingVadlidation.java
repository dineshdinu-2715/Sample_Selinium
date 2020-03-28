package cts.testng.practise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingVadlidation {
  @Test
  public void test1() {
	  String mystr="dinu";
    Assert.assertTrue(mystr.contains("dinu"), "Name are matching");
  }
  @Test
    public void test2() {
	  String mystr="dinu";
      Assert.assertTrue(mystr.contains("dinesh"), "Name are matching");

    
  }
  @Test
  public void test3() {
	  
	  
	  Assert.assertEquals(12, 13,"Dropdown count does not match plz check with developer");
  }
  @Test
	  public void test4() {
		  
		  
		  Assert.assertEquals(13, 13,"Dropdown count does not match plz check with developer");
	  }
  }
