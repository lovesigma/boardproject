angular.module('RedisBoard',[])
	.factory('BoardsResource',function(){
	var data;
	return {
		get : function(){
			return data;
		},
		formServer : function(){
			data = $resource('/boards',{
				get: {method:'GET'}
					 });
			console.dir(data);
		}
	};
});