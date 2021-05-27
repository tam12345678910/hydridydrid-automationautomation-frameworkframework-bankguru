package commons;

public class GlobalConstants {
	public static final String DEV_SEVER = "https://demo.nopcommerce.com";
	public static final String TESTING_SEVER = "https://testing.nopcommerce.com";
	public static final String STAGING_SEVER = "https://staging.nopcommerce.com";
	public static final long SHORT_TIMEOUT = 5;
	public static final long LONG_TIME = 30; 
	public static final String OS_NAME = System.getProperty("os.name");
	public static final String ROOT_FOLDER =  System.getProperty("user.dir");
	public static final String BROWSER_LOG_FOLDER = ROOT_FOLDER + "/src/main/resources" + getDirectorySlash("browserLog");
	public static final String DOWLOAD_FOLDER = ROOT_FOLDER + "/src/main/resources" + getDirectorySlash("dowloadFiles");
	public static final String UPLOAD_FOLDER = ROOT_FOLDER + "/src/main/resources" + getDirectorySlash("uploadFiles");
	
	
	private static String getDirectorySlash(String folderName) {
		if (isMac() || isUnix() || isSolaris()) {
			folderName = "/" + folderName + "/";
		} else if (isWindows()) {
			folderName = "\\" + folderName + "\\";
		} else {
			folderName = null;
		}
		return folderName;
	}

	private static boolean isWindows() {
		return (GlobalConstants.OS_NAME.toLowerCase().indexOf("win") >= 0);
	}

	private static boolean isMac() {
		return (GlobalConstants.OS_NAME.toLowerCase().indexOf("mac") >= 0);
	}

	private static boolean isUnix() {
		return (GlobalConstants.OS_NAME.toLowerCase().indexOf("nix") >= 0 || GlobalConstants.OS_NAME.toLowerCase().indexOf("nux") >= 0);
	}

	private static boolean isSolaris() {
		return (GlobalConstants.OS_NAME.toLowerCase().indexOf("sunos") >= 0);
	}
}
