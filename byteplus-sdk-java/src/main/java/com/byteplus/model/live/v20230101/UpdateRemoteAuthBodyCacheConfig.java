package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRemoteAuthBodyCacheConfig
 */
@lombok.Data
public final class UpdateRemoteAuthBodyCacheConfig  {

    /**
     * <p>缓存过期时间，默认值为 `0` 时表示不缓存，单位为秒，取值范围为 [0,3600]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 鉴权成功与鉴权失败使用相同配置时，表示鉴权缓存过期时间；</p>
     *
     * <p>- 鉴权成功与鉴权失败不使用相同配置时，表示鉴权成功缓存的过期时间。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CacheExpireSecond")
    private Float cacheExpireSecond;

    /**
     * <p>鉴权失败缓存的过期时间，默认值为 `0` 时表示不缓存，单位为秒，取值范围为 [0,3600]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>鉴权成功与鉴权失败不使用相同配置，即 UseSameCache 配置 false 时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyExpireSecond")
    private Float denyExpireSecond;

    /**
     * <p>生成鉴权结果缓存 Key 使用的参数配置，最多支持配置 50 个参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 鉴权成功与鉴权失败使用相同配置时，表示鉴权结果缓存 Key 配置；</p>
     *
     * <p>- 鉴权成功与鉴权失败不使用相同配置时，表示鉴权成功缓存的过期时间。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CacheKeys")
    private UpdateRemoteAuthBodyCacheConfigCacheKeys cacheKeys;

    /**
     * <p>生成鉴权失败结果缓存 Key 使用的参数配置，最多支持配置 50 个参数。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>鉴权成功与鉴权失败不使用相同配置，即 UseSameCache 配置 false 时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyKeys")
    private UpdateRemoteAuthBodyCacheConfigDenyKeys denyKeys;

    /**
     * <p>鉴权成功和鉴权失败是否使用相同的配置（包括缓存的 key 值和缓存过期时间）。</p>
     *
     * <p>- `true`：使用相同配置；</p>
     *
     * <p>- `false`：不使用相同配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseSameCache")
    private Boolean useSameCache;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
