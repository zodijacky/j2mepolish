//#condition polish.android

// generated by de.enough.doc2java.Doc2Java (www.enough.de) on Wed Jan 21 22:12:19 CET 2009

package de.enough.polish.android.io.file;

/**
 * Represents an exception thrown when a method is invoked on a file connection
 * but the method cannot be completed because the connection is closed.
 */
public class ConnectionClosedException extends java.lang.RuntimeException
{
	/**
	 * 
	 * Constructs a new instance of this class with its stack trace filled in.
	 * <P></P>
	 * 
	 */
	public ConnectionClosedException()
	{
		super();
	}

	/**
	 * 
	 * Constructs a new instance of this class with its stack trace and message filled
	 * in.
	 * <P></P>
	 * 
	 * @param detailMessage - String The detail message for the exception.
	 */
	public ConnectionClosedException(java.lang.String detailMessage)
	{
		super( detailMessage );
	}

}