package com.hikmah.wijayanti.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import com.hikmah.wijayanti.model.ResponseModel;

public interface RestApi {

    @GET("read.php")
    Call<ResponseModel> getDataLaptop();

    @FormUrlEncoded
    @POST("insert.php")
    Call<ResponseModel> sendDataLaptop(@Field("nama") String nama,
                                    @Field("jenis") String jenis,
                                    @Field("stok") String stok);


    @FormUrlEncoded
    @POST("update.php")
    Call<ResponseModel> updateData( @Field("id") String id,
                                    @Field("nama") String nama,
                                    @Field("jenis") String jenis,
                                    @Field("stok") int stok);

    @FormUrlEncoded
    @POST("delete.php")
    Call<ResponseModel> deleteData(@Field("id") String id);
}
