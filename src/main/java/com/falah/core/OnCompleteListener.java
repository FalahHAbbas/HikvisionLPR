package com.falah.core;


import com.falah.models.Error;

public interface OnCompleteListener<T> {
    void onComplete(T result, Error error);
}
