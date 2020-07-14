package com.zs.zs_jetpack.ui.integral

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.zs.base_library.base.BaseViewModel
import com.zs.wanandroid.entity.IntegralBean
import com.zs.wanandroid.entity.IntegralRecordBean

/**
 * des 文章vm
 * @date 2020/7/8
 * @author zs
 */
class IntegralVM : BaseViewModel() {
    private val repo by lazy { IntegralRepo(viewModelScope, errorLiveData) }


    /**
     * 收藏的的文章
     */
    val integralLiveData = MutableLiveData<MutableList<IntegralRecordBean.DatasBean>>()


    /**
     * 获取收藏列表
     */
    fun getIntegral(isRefresh: Boolean) {
        repo.getIntegral(
            isRefresh, integralLiveData, emptyLiveDate
        )
    }


}