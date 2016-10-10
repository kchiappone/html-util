package net.chiappone.util;

/**
 * @author Kurtis Chiappone
 * @date 10/9/2016
 */
public class HtmlUtil {

	/**
	 * @return
	 */
	public static String getBasicStylesheet() {

		StringBuilder html = new StringBuilder();
		html.append( "<style type=text/css>body { background: white; font: 10pt arial,helvetica,sans-serif; color: black; }" );
		html.append( "p { background: white; font: 10pt arial,helvetica,sans-serif; color: black; }" );
		html.append( "table { padding-right: 0px; padding-left: 0px; padding-bottom: 0px; margin: 0px; }" );
		html.append( "tr { padding-right: 0px; padding-left: 0px; padding-bottom: 0px; margin: 0px;" );
		html.append( "font: 10pt arial,helvetica,sans-serif; color: black; padding-top: 0px }" );
		html.append( "tr .error { background-color: #FFE6E6; }" );
		html.append( "td { padding: 5px; margin: 0px; font: 9pt arial,helvetica,sans-serif; color: black; }" );
		html.append( "td .error { font-weight: bold; color: red; }" );
		html.append( "th { padding: 5px; background: steelblue; font: bold 10pt Arial,Helvetica,sans-serif; color: white; text-align: center; }" );
		html.append( "table, th, td { border: 1px solid black; }" );
		html.append( ".small { font: 8pt consolas,courier new,sans-serif; color: black; }" );
		html.append( "li { font: 10pt arial,helvetica,sans-serif; color: black; }" );
		html.append( "h1 { font: 18pt arial,helvetica,sans-serif; color: black; }" );
		html.append( "h2 { font: 16pt arial,helvetica,sans-serif; color: black; }" );
		html.append( "h3 { font: 14pt arial,helvetica,sans-serif; color: black; }" );
		html.append( "h4 { font: 12pt arial,helvetica,sans-serif; color: black; }" );
	    	html.append( ".code { font-size: 8pt; font-family: Lucida Sans Typewriter, Lucida Typewriter, Courier New, Courier, monospace; font-weight: bold; margin-top: 15px; margin-left: 15px; white-space: pre; }" );
		html.append( "</style>" );
		return html.toString();

	}

	/**
	 * @return
	 */
	public static String getBreak() {

		return "<br/>";

	}

	/**
	 * @param text
	 * @return
	 */
	public static String getParagraph( String text ) {

		return "<p>" + text + "</p>";

	}

	/**
	 * @param colSpan
	 * @param header
	 * @return
	 */
	public static String getTableHeader( int colSpan, String header ) {

		StringBuilder html = new StringBuilder();
		html.append( "<tr>" );
		html.append( "<th colspan=\"" + colSpan + "\">" + header + "</th>" );
		html.append( "</tr>" );
		return html.toString();

	}

	/**
	 * @param headers
	 * @return
	 */
	public static String getTableHeaders( Object... headers ) {

		StringBuilder html = new StringBuilder();
		html.append( "<tr>" );

		for ( Object header : headers ) {

			if ( header instanceof Number ) {

				html.append( "<th align=\"right\">" + header + "</th>" );

			} else {

				html.append( "<th>" + header + "</th>" );

			}

		}

		html.append( "</tr>" );
		return html.toString();

	}

	/**
	 * @param trClass
	 * @param tdClass
	 * @param rows
	 * @return
	 */
	public static String getTableRows( String trClass, String tdClass, Object... rows ) {

		StringBuilder html = new StringBuilder();

		html.append( "<tr" );

		if ( trClass != null ) {

			html.append( " class=\"" + trClass + "\"" );

		}

		html.append( ">" );

		for ( Object row : rows ) {

			html.append( "<td" );

			if ( tdClass != null ) {

				html.append( " class=\"" + tdClass + "\"" );

			}

			if ( row instanceof Number ) {

				html.append( " align=\"right\"" );

			}

			html.append( ">" + row + "</td>" );

		}

		html.append( "</tr>" );
		return html.toString();

	}

}
