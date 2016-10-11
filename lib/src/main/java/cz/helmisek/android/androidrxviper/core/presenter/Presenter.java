package cz.helmisek.android.androidrxviper.core.presenter;

import android.content.Context;
import android.databinding.ViewDataBinding;

import cz.helmisek.android.androidrxviper.core.contract.PresenterDefaultContract;
import cz.helmisek.android.androidrxviper.core.interactor.Interactor;
import cz.helmisek.android.androidrxviper.core.viewmodel.ViewModel;


public abstract class Presenter<VM extends ViewModel, VB extends ViewDataBinding> implements PresenterDefaultContract<VM>
{
	private VM mViewModel;
	private Context mContext;


	public Presenter(Context context, VB binding)
	{
		this.mContext = context;
		this.mViewModel = initViewModel();
		this.mViewModel.setBinding(binding);

		init();
	}


	public void init()
	{
	}


	@Override
	public void onResume()
	{
		this.mViewModel.subscribe();
	}


	@Override
	public void onPause()
	{
		this.mViewModel.unsubscribe();
	}


	@Override
	public VM getViewModel()
	{
		return this.mViewModel;
	}


	public Context getContext()
	{
		return this.mContext;
	}


	public VB getBinding()
	{
		return (VB) this.mViewModel.getBinding();
	}

}