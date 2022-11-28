package crc64e6d0b84c6264ccdd;


public class AuthenticationHandler
	extends androidx.biometric.BiometricPrompt.AuthenticationCallback
	implements
		mono.android.IGCUserPeer,
		android.content.DialogInterface.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAuthenticationSucceeded:(Landroidx/biometric/BiometricPrompt$AuthenticationResult;)V:GetOnAuthenticationSucceeded_Landroidx_biometric_BiometricPrompt_AuthenticationResult_Handler\n" +
			"n_onAuthenticationError:(ILjava/lang/CharSequence;)V:GetOnAuthenticationError_ILjava_lang_CharSequence_Handler\n" +
			"n_onAuthenticationFailed:()V:GetOnAuthenticationFailedHandler\n" +
			"n_onClick:(Landroid/content/DialogInterface;I)V:GetOnClick_Landroid_content_DialogInterface_IHandler:Android.Content.IDialogInterfaceOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Plugin.Fingerprint.AuthenticationHandler, Plugin.Fingerprint", AuthenticationHandler.class, __md_methods);
	}


	public AuthenticationHandler ()
	{
		super ();
		if (getClass () == AuthenticationHandler.class) {
			mono.android.TypeManager.Activate ("Plugin.Fingerprint.AuthenticationHandler, Plugin.Fingerprint", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAuthenticationSucceeded (androidx.biometric.BiometricPrompt.AuthenticationResult p0)
	{
		n_onAuthenticationSucceeded (p0);
	}

	private native void n_onAuthenticationSucceeded (androidx.biometric.BiometricPrompt.AuthenticationResult p0);


	public void onAuthenticationError (int p0, java.lang.CharSequence p1)
	{
		n_onAuthenticationError (p0, p1);
	}

	private native void n_onAuthenticationError (int p0, java.lang.CharSequence p1);


	public void onAuthenticationFailed ()
	{
		n_onAuthenticationFailed ();
	}

	private native void n_onAuthenticationFailed ();


	public void onClick (android.content.DialogInterface p0, int p1)
	{
		n_onClick (p0, p1);
	}

	private native void n_onClick (android.content.DialogInterface p0, int p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
