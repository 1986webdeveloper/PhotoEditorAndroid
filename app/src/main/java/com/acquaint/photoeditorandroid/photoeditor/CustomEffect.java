package com.acquaint.photoeditorandroid.photoeditor;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import java.util.HashMap;
import java.util.Map;


@SuppressWarnings("ALL")
public class CustomEffect {

    private String mEffectName;
    private Map<String, Object> parametersMap;

    private CustomEffect(Builder builder) {
        mEffectName = builder.mEffectName;
        parametersMap = builder.parametersMap;
    }

    /**
     * @return Custom effect name from {@link android.media.effect.EffectFactory#createEffect(String)}
     */
    public String getEffectName() {
        return mEffectName;
    }

    /**
     * @return map of key and value of parameters for {@link android.media.effect.Effect#setParameter(String, Object)}
     */
    public Map<String, Object> getParameters() {
        return parametersMap;
    }

    /**
     * Set customize effect to image using this builder class
     */
    public static class Builder {

        private String mEffectName;
        private Map<String, Object> parametersMap = new HashMap<>();


        public Builder(@NonNull String effectName) throws RuntimeException {
            if (TextUtils.isEmpty(effectName)) {
                throw new RuntimeException("Effect name cannot be empty.Please provide effect name from EffectFactory");
            }
            mEffectName = effectName;
        }


        public Builder setParameter(@NonNull String paramKey, Object paramValue) {
            parametersMap.put(paramKey, paramValue);
            return this;
        }

        /**
         * @return instance for custom effect
         */
        public CustomEffect build() {
            return new CustomEffect(this);
        }
    }
}
