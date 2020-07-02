package com.example.mvvmapp.data.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface ApiService {

    @FormUrlEncoded
    @POST("api/user/login")
    open fun userLogin(
        @Field("userName") userName: String?,
        @Field("passWord") passWord: String?
    ): Call<ResponseBody>?

    companion object{
        operator fun invoke() :ApiService{
            return Retrofit.Builder()
                .baseUrl("http://10.0.1.25/foodorder/public/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ApiService::class.java)
        }
    }
}