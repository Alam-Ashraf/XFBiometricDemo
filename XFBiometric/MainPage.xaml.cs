using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Plugin.Fingerprint;
using Plugin.Fingerprint.Abstractions;
using Xamarin.Forms;

namespace XFBiometric
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        async void OnAuthenticateClicked(System.Object sender, System.EventArgs e)
        {
            var availability = await CrossFingerprint.Current.IsAvailableAsync();

            if (!availability)
            {
                StackContainer.IsVisible = false;
                await DisplayAlert("Warning!", "No biometrics available", "OK");

                return;
            }

            var authResult = await CrossFingerprint.Current.AuthenticateAsync(new AuthenticationRequestConfiguration("Heads up!", "Please validate biometric !!"));

            if (authResult.Authenticated)
            {
                Device.BeginInvokeOnMainThread(() =>
                {
                    StackContainer.IsVisible = true;
                    ImgSuccess.Source = ImageSource.FromFile("success.png");
                    LblMsg.Text = "Authentication Successfully !!";
                });
            }
            else
            {
                Device.BeginInvokeOnMainThread(() =>
                {
                    StackContainer.IsVisible = true;
                    ImgSuccess.Source = ImageSource.FromFile("cross.jpg");
                    LblMsg.Text = "Authentication Failed !!";
                });
            }
        }
    }
}
