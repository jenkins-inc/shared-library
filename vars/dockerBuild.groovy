def call (imageHandle, name){
    env.imageHandle = docker.build name
}