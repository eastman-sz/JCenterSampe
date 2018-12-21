package com.smilefuns.httpelper;

import java.util.Map;

public interface CommonNet {

    void onRequest(Map<String , Object> params , OnHttpRequestListener onHttpRequestListener);

}
