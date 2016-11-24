package cz.helmisek.android.androidvipersample;

import android.app.Activity;
import android.content.Context;
import android.databinding.ViewDataBinding;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import cz.helmisek.android.androidviper.core.presenter.Presenter;
import cz.helmisek.android.androidviper.core.util.ViewWrapper;
import cz.helmisek.android.androidvipersample.core.viewmodel.WeatherActivityViewModel;

import static org.junit.Assert.assertEquals;


/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricTestRunner.class)
public class WeatherActivityViewModelUnitTest
{
	private WeatherActivityViewModel mWeatherActivityViewModel;


	@Before
	public void setUp() throws Exception
	{
		this.mWeatherActivityViewModel = new WeatherActivityViewModel(null);
		this.mWeatherActivityViewModel.bind(new ViewWrapper<ViewDataBinding, Presenter>()
		{
			@Override
			public int getLayoutId()
			{
				return R.layout.activity_weather;
			}


			@Override
			public Context getContext()
			{
				return RuntimeEnvironment.application;
			}


			@Override
			public Presenter getPresenter()
			{
				return null;
			}


			@Override
			public ViewDataBinding getBinding()
			{
				return null;
			}


			@Override
			public Activity getActivityContext()
			{
				return null;
			}
		});
		this.mWeatherActivityViewModel.onViewModelCreated();
	}


	@Test
	public void test_getLastLocation() throws Exception
	{
		assertEquals("London", this.mWeatherActivityViewModel.getLastLocation());
	}
}