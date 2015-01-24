angular.module('RedisBoard',['ngResource'])
.factory('Boards',['$resource','BoardsResource',function($resource,BoardsResource){
	var data ={};
	return {
		get : function(){
			return data;
		},
		fromServer : function(){
			BoardsResource.get().$promise.then(function(result){
				data.boardList = result;
			});
		},
		write : function(param){
			BoardsResource.post(param);
		}
	};
}]).provider('BoardsResource', function() {
    this.$get = ['$resource', function($resource) {
        var Post = $resource('/board/boards', {}, {
          get: {
            method: 'GET', isArray:true
          },post: {
            method: 'POST'
          }
        });  	
        return Post;
      }];
    })
	.controller("mainCtrl",function($scope,Boards,$http){
		$scope.boards = Boards.get();
		Boards.fromServer();
		$scope.clearRedis = function(){
			$http.get('/board/redisclear');	
		};
		$scope.appName = 'kun';
	
	})
	.controller("WriteCtrl",function($scope,Boards){
		$scope.title = "";
		$scope.write = function(){
			Boards.write({'title':$scope.title,'creator':$scope.creator,
				'content':$scope.content});
			console.dir($scope.title);
			console.dir($scope.creator);
			console.dir($scope.content);
			console.dir("제출이 완료되었음");
		};
	});