package com.falah.core;


import com.falah.models.Error;

import java.util.List;

public interface OnListCompleteListener<T> {
    void onComplete(List<T> result, Error error);
}
