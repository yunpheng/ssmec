
function requireEcPath(ecPath){
	require.config({
	    paths: {
	        'geoJson': ecPath+'/echarts-3.2.3/geoData/geoJson',
	        'theme': ecPath+'/echarts-3.2.3/theme',
	        'data': ecPath+'/echarts-3.2.3/data',
	        'map': ecPath+'/echarts-3.2.3/map',
	        'extension': ecPath+'/echarts-3.2.3/extension'
	    },
	    packages: [
	        {
	            main: 'echarts',
	            location: ecPath+'/echarts-3.2.3/src',
	            name: 'echarts'
	        },
	        {
	            main: 'zrender',
	            location: ecPath+'/zrender/src',
	            name: 'zrender'
	        }
	    ]
	    // urlArgs: '_v_=' + +new Date()
	});
}
