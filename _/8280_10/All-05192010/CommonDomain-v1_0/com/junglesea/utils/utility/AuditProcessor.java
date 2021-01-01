package com.junglesea.utils.utility;
public class AuditProcessor {
	public static void auditProcessor(java.lang.String AuditMessage, java.lang.String AuditAction) {
		java.util.Date __result__1;
		{// current date and time
			__result__1 = new java.util.Date();
		}
		java.lang.String __result__2 = "yyyy-dd-mm HH:mm:ss";
		java.lang.String __result__3;
		{// format locale date to string using pattern
			java.util.Locale locale = java.util.Locale.getDefault();
			java.text.SimpleDateFormat df2 = new java.text.SimpleDateFormat(__result__2,locale);
			__result__3 = df2.format(__result__1);
		}
		java.lang.String __result__5;
		{// append text
			__result__5 = __result__3.concat(AuditMessage);
		}
		java.lang.String __result__7;
		{// append text
			__result__7 = __result__5.concat(AuditAction);
		}
		{// print to log
			System.out.println(__result__7);
		}
	}
}