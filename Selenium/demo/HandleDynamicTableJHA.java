//package demo;
//
//public class HandleDynamicTableJHA {
//
//	public String glTable = "//table[@id='wireType']//tbody/tr[row]/td[col]//input";
//
//	@Step
//	public void enterValueInGLSettingField(String accNo, String branNo, String accSufx, DataTable table) {
//		List<List<String>> list = table.asLists();
//		String wire = list.get(0).get(0);
//		WebElement element;
//		commonMethods.waitForLoaderDissappear();
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 3; j <= 5; j++) {
//				String xpath = wireSourceConfigurationObjects.glTable.replace("wireType", wire);
//				xpath = xpath.replace("row", Integer.toString(i));
//				xpath = xpath.replace("col", Integer.toString(j));
//				element = findBy(xpath);
//				if (wire.equalsIgnoreCase("generalLedgerIncomingWire")) {
//					commonMethods.scrollToElement(element);
//				}
//				commonMethods.clearText(element);
//				if (j == 3) {
//					commonMethods.enterText(element, accNo);
//					Log.INFO("Account Non Entered : " + accNo);
//				} else if (j == 4) {
//					commonMethods.enterText(element, accSufx);
//					Log.INFO("Account Sufix Entered : " + accSufx);
//				} else if (j == 5) {
//					commonMethods.enterText(element, branNo);
//					Log.INFO("Branch Number : " + branNo);
//				}
//				xpath = null;
//			}
//		}
//		waitFor(100);
//	}
//
//}
