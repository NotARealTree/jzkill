# jzkill
[![CircleCI](https://circleci.com/gh/NotARealTree/jzkill.svg?style=svg)](https://circleci.com/gh/NotARealTree/jzkill) [ ![Download](https://api.bintray.com/packages/notarealtree/jzkill/jzkill/images/download.svg) ](https://bintray.com/notarealtree/jzkill/jzkill/_latestVersion)

ZKillBoard RedisQ Java Consumer

## How do I use this?

JZKill is a simple wrapper around the responses provided by the [ZKillboard Redis Queue](https://github.com/zKillboard/RedisQ). The mode of operation is the same as described in the Redis Queue Repo. As in the original example, you'll have to actively poll the poller which will return results whenever they are available, or time-out after 10 seconds returning `Optional.empty();`.

```
RedisQPoller poller = new RedisQPoller();
while (true) {
    Optional<Package> maybePackage = poller.poll();
    // Your logic here
}
```

By default, the JZKill poller catches exceptions and logs them, if you want to handle these exceptions on your side, instantiate a `ThrowingRedisQPoller` instead.

## How can I add this to my project?

JZkill is available on [Bintray](https://bintray.com/notarealtree/jzkill/jzkill). 
To add JZkill to your project, add `jcenter` as one of your repositories in your gradle file
```
repositories {
    jcenter()
}
```
And add the actual package to your dependencies:
```
compile 'xyz.notarealtree:jzkill:<VERSION>'
```
