package com.example.jpaSampleTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class TestRedisConnect {
	@Test
	public void testRedisConnect(){
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		JedisPool pool = new JedisPool(jedisPoolConfig, "localhost", 0, 0, "8011", 1000, "password");

		Jedis jedis = pool.getResource();

		jedis.set("foo", "bar");
		String value = jedis.get("foo");
		assertTrue( value != null && value.equals("bar") );

		jedis.del("foo");
		value = jedis.get("foo");
		assertTrue( value == null );

		if( jedis != null ){
			jedis.close();
		}
	}
}
