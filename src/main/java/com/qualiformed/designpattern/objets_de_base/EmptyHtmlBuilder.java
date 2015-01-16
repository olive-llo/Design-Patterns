package objets_de_base;

public class EmptyHtmlBuilder
{
	public static String get(String title)
	{
		String result = "";
		
		StringBuilder sb = new StringBuilder();
		sb.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n");
		sb.append("<html>\n");
		sb.append("<head>\n");
		sb.append("<title>"+title+"</title>\n");
		sb.append("</head>\n");
		sb.append("<body>\n");
		sb.append("{body}\n");
		sb.append("</body>\n");
		sb.append("</html>\n");
		result = sb.toString();
		
		return result;
	}
}
